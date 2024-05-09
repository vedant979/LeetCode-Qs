class CustomStack {
    int top;
    int size;
    int [] arr;
    public CustomStack(int maxSize) {
        size = maxSize;
        arr = new int[size];
        top = -1;
    }
    
    public void push(int x) {
        if(top<size-1){
        top++;
        arr[top] = x;
        }
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        int n = arr[top];
        top--;
        return n;
    }
    
    public void increment(int k, int val) {
        if(top==-1){
            return;
        }
        // int bottom = arr.length;
        int btm = Math.min(k, arr.length);
        for(int i=0;i<btm;i++){
            arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */