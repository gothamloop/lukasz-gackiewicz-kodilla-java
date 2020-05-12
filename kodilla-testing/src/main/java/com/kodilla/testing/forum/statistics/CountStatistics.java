package com.kodilla.testing.forum.statistics;

public class CountStatistics {

    private static int numberOfUsers;
    private static int numberOfPosts;
    private static int numberOfComments;
    private static double avgPostsPerUser;
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

    private int calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgPostsPerUser = methodAvgPostsPerUser();
        avgCommentsPerUser = methodAvgCommentsPerUser();
        avgCommentsPerPost = methodAvgCommentsPerPost();

        return 0;
    }


    private double methodAvgPostsPerUser(Statistics statistics) {
        if (numberOfUsers > 0) {
            return (double) statistics.postsCount() / numberOfUsers;
        } else {
            return 0;
        }
    }



  /*  private int methodAvgPostsPerUser() {
        if (numberOfUsers > 0) {
            avgPostsPerUser = (numberOfPosts / numberOfUsers);
        } else {
            return 0;
        }
        return 0;
    }
*/
    private int methodAvgCommentsPerUser() {
            if (numberOfUsers > 0) {
                avgCommentsPerUser = (numberOfComments / numberOfUsers);
            } else {
                return 0;
            }
        return 0;
    }

    private int methodAvgCommentsPerPost() {
            if (numberOfUsers > 0)
            {
                avgCommentsPerPost = (numberOfComments / numberOfPosts);
            } else {
                return 0;
            }
        return 0;
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
