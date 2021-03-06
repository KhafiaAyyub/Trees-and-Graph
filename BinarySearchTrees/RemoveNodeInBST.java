public static int max(Node node){
    if(node.right != null){
        return max(node.right);
    }else{
        return node.data;
    }
}


 public static Node remove(Node node, int data) {
if(node == null){
    return null;
}

if(data > node.data){
    node.right = remove(node.right,data);
} else if(data < node.data){  //to receive from left
 node.left = remove(node.left,data);
} else{
    if(node.left !=null && node.right != null){ //both child present
        //find max from left side
        int lmax = max(node.left);
        node.data = lmax;
        //remove
        node.left = remove(node.left,lmax);
        return node;
    }else if(node.left != null){
        return node.left;
    }else if(node.right != null){
        return node.right;
    }else{
        return null;
    }  
}
return node;
}
