

public static boolean find(Node node, int data){
    if(node == null){
      return false;
    }

    if(data>node.data){
      return find(node.right,data);
    }else if(data<node.data){
      return find(node.left,data);
    }else{
      return true;
    }
  }  