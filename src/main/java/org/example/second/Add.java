package org.example.second;

public class Add {
public void add(int... args){
    String out = args[0]+"+";
    int sum = args[0];
    for (int i = 1; i < args.length; i++) {

        if(i==args.length-1){
            sum += args[i];
            out += args[i]+"="+ sum;
        } else {
            sum += args[i];
            out += args[i]+"+";
        }
    }
    System.out.println(out);
}
}
