package com.kodilla.testing.forum.statistics;

public class CountStatistics {

    private static int numberOfUsers;
    private static int numberOfPosts;
    private static int numberOfComments;
    private static int avgPostsPerUser;
    private static int avgCommentsPerUser;
    private static int avgCommentsPerPost;


    public int getNumberOfUsersUsers() {
        return numberOfUsers;
    }

    public static int getNumberOfPosts() {
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

   static void calculateAdvStatistics(Statistics statistics){
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
