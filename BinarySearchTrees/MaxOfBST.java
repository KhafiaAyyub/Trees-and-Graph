

 public static int max(Node node) {
    if(node.right!=null){
      return max(node.right);
    }else{
      return node.data;
    }
  }