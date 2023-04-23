class Solution {
public:
    int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int actualTime=arrivalTime+delayedTime;
        if(actualTime>=24)return actualTime%24;
        else return actualTime;
        
    }
};