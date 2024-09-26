class Main {
  
  public static void main(String[] args) {
    int[][] a = {{3,2},{1,5}};
    System.out.print(expand(a));
  }

  public static String arrayToString(int[] arr){
    String str = "";
    str += "{";
    for(int i = 0; i < arr.length; i++){
      if(i == arr.length-1){
        str += arr[i];
      }
      else{
        str += arr[i] + ", ";
      }
    }
    str += "}";
    
    return str;
  }
  
  // \n
  public static String arrayToString(int[][] arr){
    String str = "{{";
    for(int r = 0; r < arr.length; r++){
      for(int c = 0; c < arr[r].length; c++){
        if(c == arr[r].length - 1){
          if(r == arr.length){
            str += "}";
          }
          str += arr[r][c] + "}," + "\n{";
        }
        else{
          str += arr[r][c] + ", ";
        }
      }
    }
    System.out.println(str);
    return str;
  }

  public static boolean TicTacToe(int[][] board){
    //blank = 0
    //X = 1
    //O = -1

    for(int r = 0; r < 3; r++){
      for(int c = 0; c < 3; c++){
        if(board[r][c] == board[r++][c++] && board[r][c] == board[r++][c++]){
          return true;
        }
        else if(board[r][c] == board[r++][c] && board[r][c] == board[r++][c]){
          return true;
        }
        else if(board[r][c] == board[r][c++] && board[r][c] == board[r][c++]){
          return true;
        }
      }
    }
    return false;
  }

  public static int sum(int[][] arr){
    int sum = 0;
    for(int r = 0; r < arr.length; r++){
      for(int c = 0; c < arr[r].length; c++){
        sum += arr[r][c];
      }
    }
    return sum;
  }

  public static int majorDiag(int[][] arr){
    int sum = 0;
    for(int r = 0; r < arr.length; r++){
      for(int c = 0; c < arr[r].length; c++){
        if(r == c){
          sum += arr[r][c];
        }
      }
    }
    return sum;
  }

  public static int minorDiag(int[][] arr){
    int sum = 0;
    for(int i = 0; i < a.length; i++){
      sum += a[a.length - i - 1][i];
    }
    return sum;
  }

  public static int min(int[] a){
    int min = a[0];
    for(int i = 0; i < a.length; i++){
      if(a[i] < min){
        min = a[i];
      }
    }
    return min;
  }
  
  public static int min(int[][] a){
    int min = a[0][0];
    for(int i = 0; i < a.length; i++){
      int temp = min(a[i]);
      if(temp < min){
        min = temp;
      }
    }
    return min;
  }
  
  public static int min2(int[][] a){
    int min = a[0][0];
    for(int r = 0; r < a.length; r++){
      for(int c = 0; c < a[r].length; c++){
        if(a[r][c] < min){
          min = a[r][c];
        }
      }
    }
    return min;
  }

  
  public static int[][] rotate90(int[][] a){
    int temp1 = 0;
    int temp2 = 0;
    temp1 = a[0][2];
    a[0][2] = a[0][0];
    temp2 = a[2][2];
    a[2][2] = temp1;
    temp1 = a[2][0];
    a[2][0] = temp2;
    a[0][0] = temp1;
    temp1 = a[0][1];
    a[0][1] = a[1][0];
    temp2 = a[1][2];
    a[1][2] = temp1;
    temp1 = a[2][1];
    a[2][1] = temp2;
    a[1][0] = temp1;
  }
  

  public static int[][] expand(int[][] a){
    if(a.length == 0){
      return null;
    }
    int[][] c = new int[2*a.length][2*a[0].length];
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[i].length; j++){
        c[2*i][2*j] = a[i][j];
        c[2*i+1][2*j+1] = a[i][j];
        c[2*i][2*j+1] = a[i][j];
        c[2*i+1][2*j] = a[i][j];
      }
    }
    return c;
  } 
  public static int[][] patternA(int n) {
    int[][] b = new int[n][];
    int a = 1;
    for (int x = 0; x < n; x++) {
      b[x] = new int[a];
      for (int i = 0; i < b[x].length; i++) {
        b[x][i] = i+1;
      }
      a++;
    
    }
    return b;
  }

  public static int[][] patternB(int n) {
    int[][] b = new int[n][];
    int a = n;
    for (int x = 0; x < n; x++) {
      b[x] = new int[a];
      for (int i = b[x].length; i >= 1; i--) {
        b[x][b[x].length - i] = i;
      }
      a--;
    
    }
    return b;
    
  }

  public static int[][] patternC(int n) {
    int[][] b = new int[n][];
    int a = 1;
    for (int x = 0; x < n; x++) {
      b[x] = new int[a];
      for (int i = 0; i < a; i++) {
        b[x][i] = n - a +1;
      }
      a++;
    
    }
    return b;
  }
  
  public static int[][] pascalTri(int n){
    int[][] a = new int[n][n];
    for(int i = 0; i<n; i++){
      a[i] = new int[i+1];
      a[i][0] = 1;
      a[i][i] = 1;
      if(i != 0){
        for(int j = 1; j<=i-1; j++){
          a[i][j] = a[i-1][j] + a[i-1][j-1];
        }
      }
    }
    return a;
  }
  
}
