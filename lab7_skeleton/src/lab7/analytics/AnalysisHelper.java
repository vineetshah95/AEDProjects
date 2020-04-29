/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.activation.DataSource;
import lab7.entities.Comment;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
    public void getUserWithMostLikes(){
         Map<Integer,Integer> userLikes = new HashMap<>();
         Map<Integer, User> userMap = DataStore.getInstance().getUsers();
         for(User u : userMap.values()){
             for(Comment comment: u.getComments()){
                 if(userLikes.containsKey(u.getId())){
                     int commentLikes = userLikes.get(u.getId()) + comment.getLikes();
                     userLikes.put(u.getId(), commentLikes);
                 }else{
                     userLikes.put(u.getId(), comment.getLikes());
                 }
                 
             }
         }
          int winner = 0;
     int maxLikes = 0;
     for(Integer i :  userLikes.keySet()){
         if(maxLikes < userLikes.get(i)){
             winner = i;
             maxLikes = userLikes.get(i);
         }
     }
     System.out.println("The user with Maximum likes is " + winner + "and the number of likes are " + maxLikes);
  }
    
    // find 5 comments which have the most likes
    // TODO
    
    public void getFiveCommentsWithMostLikes(){
        Map<Integer,Comment> commentMap = DataStore.getInstance().getComments();
        List<Comment> comments= new ArrayList<>(commentMap.values());
        Collections.sort(comments, new Comparator<Comment>(){
        @Override
        public int  compare(Comment c1, Comment c2){
            return c2.getLikes()-c1.getLikes();
        }
    });
        for(int i=0; i<5;i++){
            System.out.println(comments.get(i));
        }
    }
    
    public void averageLikesPerComment(){
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        System.out.println("------------");
        int likes = 0,comment = comments.size();
        for(Map.Entry<Integer,Comment> i: comments.entrySet()){
            Comment c = i.getValue();
            likes += c.getLikes();
        }
        System.out.println("Average number of likes per comment is "+(float)(likes/comment));
    }
    
    public void mostLikedComments(){
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
    
    public void mostComents(){
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
        List<Map.Entry<Integer, Integer> > list = 
               new ArrayList<Map.Entry<Integer, Integer> >(m.entrySet()); 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        });
        System.out.println("The post with Most comment is "+list.get(list.size()-1).getKey()+ " with comments "+list.get(list.size()-1).getValue());
    }
    public void inActiveUser(){
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
            System.out.println("Inactive User "+i+" is "+list.get(i).getKey());
        }
    }
    
}
