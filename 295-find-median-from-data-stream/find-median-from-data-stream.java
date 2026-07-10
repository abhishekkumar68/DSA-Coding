class MedianFinder {
    PriorityQueue<Integer> leftminHeap = new PriorityQueue<>();
    PriorityQueue<Integer> rightmaxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(leftminHeap.size()==rightmaxHeap.size()){
            rightmaxHeap.add(num);
            leftminHeap.add(rightmaxHeap.remove());
        }
        else{
            leftminHeap.add(num);
            rightmaxHeap.add(leftminHeap.remove());
        }
        
    }
    
    public double findMedian() {
        if(leftminHeap.size()==rightmaxHeap.size()){
            double ans = (leftminHeap.peek()+rightmaxHeap.peek())/2.0;
            return ans;
        }
        else{
            return (double)leftminHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */