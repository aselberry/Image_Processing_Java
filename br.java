import java.util.Arrays;
/*A video player allows users to choose videos to play but it has some rules. The videos must be chosen in pairs and each pair must have a duration which is a multiple of 60 seconds (e.g. 40 + 20, 90 + 30). Given the number of videos and the list of video durations, calculate the total number of different video pairs that can be chosen. Each video can only appear once in each pair, but can appear in multiple pairs. The order of videos in each pair is not important.

Function Description

Complete the function playlist in the editor below.

playlist has the following parameter(s):

int videos[n]:  the video durations in seconds
Returns:

int: the number of valid pairs
Constraints

1 ≤ n ≤ 1000
1 ≤ videos[i] ≤ 1000, where 0 ≤ i < n
Input:
3
40
20
60
Is equal to:

n = 3
videos = [40, 20, 60]
Output:
Only one pair of videos has a combined duration that is a multiple of a whole minute (40 + 20 = 60), so return 1. While the third video is a single minute long, videos must be chosen in pairs. */


/*class br{

    public int task(int[] videos, int n){
        int count = 0; 
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if((videos[i] + videos[j]) % 60 == 0){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] argc){
        int[] videos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500, 510, 520, 530, 540, 550, 560, 570, 580, 590, 600, 610, 620, 630, 640, 650, 660, 670, 680, 690, 700, 710, 720, 730, 740, 750, 760, 770, 780, 790, 800, 810, 820, 830, 840, 850, 860, 870, 880, 890, 900, 910, 920, 930, 940, 950, 960, 970, 980, 990, 1000};
        br instance = new br(); // Create an instance of the class
        System.out.println(instance.task(videos, videos.length));
        System.out.println(videos.length);
    }
}*/

class br{

    public int task(int[] videos, int n){
        int count = 0; 
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if((videos[i] + videos[j]) % 60 == 0){
                    count++;
                }
            }
        }

        return count;
    }

    public int sndlargest(int[] videos){
        Arrays.sort(videos);
        return videos[videos.length-2]; 
    }


    public class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public ListNode middleNode(ListNode head){
        ListNode t1 = head;
        ListNode t2 = head;
        while(t2 != null && t2.next != null){
            t1 = t1.next;
            t2 = t2.next.next; 
        }
        return t1; 
    }
    public static void main(String[] argc){
        int[] videos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500, 510, 520, 530, 540, 550, 560, 570, 580, 590, 600, 610, 620, 630, 640, 650, 660, 670, 680, 690, 700, 710, 720, 730, 740, 750, 760, 770, 780, 790, 800, 810, 820, 830, 840, 850, 860, 870, 880, 890, 900, 910, 920, 930, 940, 950, 960, 970, 980, 990, 1000};
        br instance = new br(); // Create an instance of the class
        System.out.println(instance.task(videos, videos.length));
        System.out.println(videos.length);
        System.out.println(instance.sndlargest(videos));
    }
}





for(int i=2; i< n/2; i++){
    if(n%i==0){
        temp++;
        break;
    }

}

if(temp==0 && n!=1){
    It is 
}