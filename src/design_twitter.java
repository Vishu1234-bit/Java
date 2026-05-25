class Twitter {
    Map<Integer,LinkedList<Tweet>> tweetsMap;
    Map<Integer,Set<Integer>> followMap;
    int time;
    class Tweet{
        int time;
        int tweetId;
        Tweet(int time, int tweetId){
            this.time=time;
            this.tweetId=tweetId;
        }
    }
    public Twitter() {
        tweetsMap = new HashMap<>();
        followMap = new HashMap<>();
        time=0;
    }
                                        
    public void postTweet(int userId, int tweetId) {
        tweetsMap.putIfAbsent(userId,new LinkedList<>());
        tweetsMap.get(userId).addFirst(new Tweet(time++,tweetId));
    }
                                                                    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feed = new ArrayList<>();
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a,b)->b.time-a.time);
        if(tweetsMap.containsKey(userId)){
            pq.addAll(tweetsMap.get(userId));
        }
        if(followMap.containsKey(userId)){
            for(int followee : followMap.get(userId)){
                if(tweetsMap.containsKey(followee)){
                    pq.addAll(tweetsMap.get(followee));
                }
            }
        }
        int count=0;
        while(!pq.isEmpty() && count<10){
            feed.add(pq.poll().tweetId);
            count++;
        }
        return feed;
    }
    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId,new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }
    public void unfollow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)){
            followMap.get(followerId).remove(followeeId);
        }
    }
}

                                                                                                                                                                                                                                                                                        /**
                                                                                                                                                                                                                                                                                         * Your Twitter object will be instantiated and called as such:
                                                                                                                                                                                                                                                                                          * Twitter obj = new Twitter();
                                                                                                                                                                                                                                                                                           * obj.postTweet(userId,tweetId);
                                                                                                                                                                                                                                                                                            * List<Integer> param_2 = obj.getNewsFeed(userId);
                                                                                                                                                                                                                                                                                             * obj.follow(followerId,followeeId);
                                                                                                                                                                                                                                                                                              * obj.unfollow(followerId,followeeId);
                                                                                                                                                                                                                                                                                               */
