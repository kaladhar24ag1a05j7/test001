//Ques3
public class Star {
public static void main(String args[]) {
int i, j;
S
int n=4;
for (i = 0; i < n; i++) {
for (j = 2 * (n - i); j >= 0; j--) {
System.out.print(" "); // Print Spaces
}
for (j = 0; j <= i; j++) { //For Loop for col
System.out.print("* "); // Print Star
}
System.out.println();
}
}
}
//question 2
public class main{
    public static void main (String[]args){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++)
            {
            System.out.print("* ");
            }
             System.out.println();
        }
    }
}
//question 1
public class main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
