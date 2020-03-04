// A question asked from me in Leewayherzt company :
// implementation of stack push and pop  using array in java
//Solution -:
package ComapniesQuestion;
public class stack {
static final int MAX=1000;
int top;
int a[]=new int[MAX];
boolean isEmpty(){
return(top<0);
}
stack(){
top=-1;
}
boolean push(int x){
if(top>=(MAX-1))
{
System.out.println("Stack overflow");
return false;
}
else{
a[++top]=x;
System.out.println(x+"pushed into stack");
return true;
}}
int pop(){
if (top<0)
{
System.out.println("Stack Underflow");
return 0;
}
else{
int x= a[top--];
return x;
}
}
int peek(){
if(top<0){
System.out.println("Stack Underflow");
return 0;
}
else {
int x=a[top];
return 0;
}
}
}

//Driver code
class Main{
public static void main(String args[]){
stack s=new stack();
s.push(10);
s.push(20);
s.push(30);
System.out.println(s.pop()+"Popped from stack");
}
}