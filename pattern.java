public class pattern {
    public static void main(String[] args) {
  int n=4;
  for(int i=0;i<2*n;i++){
    if(i<=n){
    for(int j=i;j<2*n-i;j++){
        System.out.print(n-i);
    }
}
else{
    for(int j=2*n-i;j>0;j--){
        System.out.print("X");
    }
}
    System.out.println();
  }
}
}

