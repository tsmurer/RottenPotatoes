package repository;

import socialnetwork.Profile;

import java.util.HashSet;

public class FriendList implements Repository{

    Profile owner;
    HashSet friendlist;

    FriendList(Profile owner){
        this.owner = owner;
        this.friendlist = new HashSet<Profile>();
    }
}

    public void addFriend(Profile profile){
        this.friendlist.add(profile);
    }
    public void remove(Profile profile){

    }

    public Profile findById(String id){
        if(this.isInRep(id) == true){
            for(Profile i:this.friendlist){
                if(i.getId() == id){
                    return i;
                }
            }
        }
    }

    public boolean isInRep(String id){
        for(Profile profile: friendlist) {
            if(profile.getId() == id){
                return true;
            }
        }
        return false;
}
