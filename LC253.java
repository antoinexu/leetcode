import java.util.Arrays;
public class LC253 {

    public int minMeetingRooms(int[][] intervals) {

        if(intervals == null || intervals.length == 0) return 0;
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i=0; i<intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0, activeMeeting = 0;
        int i=0, j=0;
        while(i<intervals.length && j<intervals.length){
            if(start[i] < end[j]){
                activeMeeting++;
                i++;
            }else{
                activeMeeting--;
                j++;
            }
            rooms = Math.max(rooms, activeMeeting);
        }
        return rooms;
    }
}
