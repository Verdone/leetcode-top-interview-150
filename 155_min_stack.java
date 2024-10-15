// 155. Min Stack
// Difficulty: Medium
// Category: Stack

class MinStack {

    int m;
    int top;
    int[] s;
    int[] mArr;

    public MinStack() {
        m=Integer.MAX_VALUE; 
        top=-1; 
        s= new int[100000];
        mArr= new int[10000];
    }
    
    public void push(int val) {
        s[++top]= val;
        if(top==0){
        m= val;
           mArr[top]= val; 
        }
        else{
            m= Math.min(mArr[top-1], val);
            mArr[top]= m;
        }
    }
    
    public void pop(){
        if(top!=-1){
             top--;
        }
    }
    
    public int top() {
        return s[top];
    }
    
    public int getMin() {
        if(top==-1){ return -1;}
        return mArr[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */