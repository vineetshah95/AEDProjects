/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    
    public void getFiveInactiveByComment(){
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList,new Comparator<User>(){
          @Override
          public int compare(User u1, User u2){
            return u1.getComments().size()-u2.getComments().size();
          }
        });
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println(userList.get(i));
        }
    }
    //Find Average number of likes per comment.
    public void getAverageLikesPerComment(){
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        int likes = 0,comment = comments.size();
        for(Map.Entry<Integer,Comment> i: comments.entrySet()){
            Comment c = i.getValue();
            likes += c.getLikes();
        }
        System.out.println("Average number of likes per comment is "+(float)(likes/comment));
    }
    
    //Post with most liked comments
    public void getMostLikedComments(){
        Map<Integer,Comment> commentMap = DataStore.getInstance().getComments();
        List<Comment> comments = new ArrayList<>(commentMap.values());
        Collections.sort(comments, new Comparator<Comment>() {
            @Override
            public int compare(Comment c1, Comment c2) {
                return c2.getLikes() - c1.getLikes();
            }
        });
        for (int i = 0; i < 1; i++) {
            System.out.println("The postId " +comments.get(i).getPostId()+" has most number of likes " +comments.get(i).getLikes());
        }
    }
    
    //Post with most comments
    public void getMostComments(){
        Map<Integer,Comment> commentMap = DataStore.getInstance().getComments();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < commentMap.size(); i++) {
            if(m.containsKey(commentMap.get(i).getPostId())){
                m.put(commentMap.get(i).getPostId(),1 + m.get(commentMap.get(i).getPostId()));
            }
            else{
               m.put(commentMap.get(i).getPostId(), 1); 
            }
        }
        List<Map.Entry<Integer, Integer> > list = new ArrayList<Map.Entry<Integer, Integer> >(m.entrySet()); 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        });
        System.out.println("The post with Most comment is "+list.get(list.size()-1).getKey()+ " with comments "+list.get(list.size()-1).getValue());
    }
    
    //5 inactive user based on total number of posts
    public void getInactiveUserBasedOnPosts(){
        Map<Integer,Comment> commentMap = DataStore.getInstance().getComments();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < commentMap.size(); i++) {
            if(m.containsKey(commentMap.get(i).getUserId())){
                m.put(commentMap.get(i).getUserId(),1 + m.get(commentMap.get(i).getUserId()));
            }
            else{
               m.put(commentMap.get(i).getUserId(), 1); 
            }
        }
        List<Map.Entry<Integer, Integer> > list = 
               new ArrayList<Map.Entry<Integer, Integer> >(m.entrySet()); 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        });
        for (int i = 0; i < 5; i++) {
            System.out.println("Inactive User "+i+" is "+list.get(i).getKey()+ " with posts "+list.get(i).getValue());
        }
    }
    public void getFiveInactiveByOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        Map<Integer, Post> post = DataStore.getInstance().getPosts();
        Map<Integer, Integer> postmap = new HashMap<>();
        List<Post> PostList = new ArrayList<>(post.values());
        int temp = 0;
        //For post
        for (Post p : PostList) {
            temp = 0;
            if (postmap.containsKey(p.getUserId())) {
                temp = postmap.get(p.getUserId());
            }
            temp = temp + 1;
            postmap.put(p.getUserId(), temp);
        }
        //for comment
        for (User user : users.values()) {
            if (postmap.containsKey(user.getId())) {
                temp = postmap.get(user.getId());
            }

            for (Comment c : user.getComments()) {
                temp += 1 + c.getLikes();
            }
            postmap.put(user.getId(), temp);
        }
        Map<Integer, Integer> treeMap = sortByValue(postmap); //new TreeMap<Integer, Integer>(postmap);
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            if (i > 4) {
                break;
            }
            for (User u : userList) {
                if (u.getId() == entry.getKey()) {
                    System.out.println(u + " Total :" + postmap.get(u.getId()));
                    i++;
                }
            }
        }
    }

    public void getFiveProActiveByOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        Map<Integer, Post> post = DataStore.getInstance().getPosts();
        Map<Integer, Integer> postmap = new HashMap<>();
        List<Post> PostList = new ArrayList<>(post.values());
        int temp = 0;
        //For post
        //System.out.println(PostList);
        for (Post p : PostList) {
            temp = 0;
            if (postmap.containsKey(p.getUserId())) {
                temp = postmap.get(p.getUserId());
            }
            temp = temp + 1;
            postmap.put(p.getUserId(), temp);
        }
        //for comment
        for (User user : users.values()) {
            if (postmap.containsKey(user.getId())) {
                temp = postmap.get(user.getId());
            }

            for (Comment c : user.getComments()) {
                temp += 1 + c.getLikes();
            }
            postmap.put(user.getId(), temp);
        }
        Map<Integer, Integer> treeMap = sortByValueDesc(postmap); //new TreeMap<Integer, Integer>(postmap);
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            if (i > 4) {
                break;
            }
            for (User u : userList) {
                if (u.getId() == entry.getKey()) {
                    System.out.println(u + " Total:" + postmap.get(u.getId()));
                    i++;
                }
            }
        }
    }

    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        /*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*/
        return sortedMap;
    }

    private static Map<Integer, Integer> sortByValueDesc(Map<Integer, Integer> unsortMap) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        /*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*/
        return sortedMap;
    }
}
