bool isIsomorphic(char* s, char* t) {
    int map1[256] = {0};
    int map2[256] = {0};

    for(int i=0;i<strlen(s);i++){
        
        if(map1[s[i]] == 0){
            map1[s[i]] = t[i];
        }
        else{
            if(map1[s[i]] != t[i])
            return false;
        }
    }


    for(int i=0;i<strlen(s);i++){
        if(map2[t[i]] == 0){
            map2[t[i]] = s[i];
        }
        else{
            if(map2[t[i]] != s[i])
            return 0;
        }
    }

    return 1;
}