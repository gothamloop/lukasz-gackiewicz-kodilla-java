package com.kodilla.testing.forum.statistics;

public class CountStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int avgPostsPerUser;
    private int avgCommentsPerUser;
    private int avgCommentsPerPost;


    public int getNumberOfUsersUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public int getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public int getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }



   private void calculateAdvStatistics(Statistics statistics){
       numberOfUsers = statistics.usersNames().size();
       numberOfPosts = statistics.postsCount();
       numberOfComments = statistics.commentsCount();
       avgPostsPerUser = (statistics.postsCount()/statistics.usersNames().size());
       avgCommentsPerUser = (statistics.commentsCount()/statistics.usersNames().size());
       avgCommentsPerPost = (statistics.commentsCount()/statistics.postsCount());
   }


   private void showStatistics(){
       System.out.println("Numbers of users: " + numberOfUsers);
       System.out.println("Numbers of posts: " + numberOfPosts);
       System.out.println("Numbers of comments: " + numberOfComments);
       System.out.println("Average posts per user: " + avgPostsPerUser);
       System.out.println("Average comments per user: " + avgCommentsPerUser);
       System.out.println("Average comments per post: " + avgCommentsPerPost);
   }


}
