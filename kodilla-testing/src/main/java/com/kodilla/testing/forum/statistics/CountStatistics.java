package com.kodilla.testing.forum.statistics;

public class CountStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public int getNumberOfUsersUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() { return numberOfPosts; }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
    //private int calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgPostsPerUser = methodAvgPostsPerUser(statistics);
        avgCommentsPerUser = methodAvgCommentsPerUser(statistics);
        avgCommentsPerPost = methodAvgCommentsPerPost(statistics);

        //return 0;
    }


    private double methodAvgPostsPerUser(Statistics statistics) {
        if (numberOfUsers > 0) {
            return (double) statistics.postsCount() / numberOfUsers;
        } else {
            return 0;
        }
    }

    private double methodAvgCommentsPerUser(Statistics statistics) {
            if (numberOfUsers > 0) {
                return (double) statistics.commentsCount() / numberOfUsers;
            } else {
                return 0;
            }
    }

    private double methodAvgCommentsPerPost(Statistics statistics) {
            if (numberOfPosts > 0) {
                return (double) statistics.commentsCount() / numberOfPosts;
            } else {
                return 0;
            }
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
