class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0,y = 0;
        String d = "N";
        int maxDis = 0;
        for(int com:commands){
            if(com==-1){
                if(d.equals("N")){
                    d = "E";
                }
                else if(d.equals("E")){
                    d = "S";
                }
                else if(d.equals("S")){
                    d = "W";
                }
                else{
                    d = "N";
                }
            }
            else if(com==-2){
                if(d.equals("N")){
                    d = "W";
                }
                else if(d.equals("W")){
                    d = "S";
                }
                else if(d.equals("S")){
                    d = "E";
                }
                else{
                    d = "N";
                }
            }
            else{
                for(int i=0;i<com;i++){
                    int nextX = x;
                    int nextY = y;
                    if(d.equals("N")){
                        nextY++;
                    }
                    else if(d.equals("W")){
                        nextX--;
                    }
                    else if(d.equals("S")){
                        nextY--;
                    }
                    else{
                        nextX++;
                    }

                    boolean obsFound = false;
                    for(int[] obs:obstacles){
                        if(obs[0]==nextX && obs[1]==nextY){
                            obsFound = true;
                            break;
                        }
                    }
                    if(obsFound){
                    break;
                }
                else{
                    x = nextX;
                    y = nextY;
                    maxDis = Math.max(maxDis,x*x+y*y);

                }
                }
                // check obs
                

                
            }
        }
        return maxDis;
    }
}


// class Solution {
//     // [4,-1,3]
//     public int robotSim(int[] commands, int[][] obstacles) {
//         // initialsie at (0,0)
//         int x = 0,y = 0;
//         String d = "N";
      
//         // int m=0;
//         // if(obstacles.length!=0)
//         // m = obstacles[0][0];
//         for(int b:commands){
//             // if turn right 90 degree
//             if(b==-1){
//                 if(d=="N"){
//                     d = "E";
//                 }
//                 else if(d=="E"){
//                     d = "W";
//                 }
//                 else if(d=="W"){
//                     d = "S";
//                 }
//                 else{
//                     d = "W";
//                 }
//                 continue;
//             }

//             // if turn left 90 degree
//             if(b==-2){
//                 if(d=="N"){
//                     d = "S";
//                 }
//                 else if(d=="S"){
//                     d = "W";
//                 }
//                 else if(d=="W"){
//                     d = "E";
//                 }
//                 else{
//                     d = "N";
//                 }
//                 continue;
//             }

//             // movement 
//             // if turn right 90 degree
//             int move = b;
//             boolean isfoundObs = false;
//             if(d=="N"){
//                 // if(obstacles.length!=0)
//                 // y+=i;
//                 // else
//                 while(move!=0){
//                     y+=move;
//                     // if(P<obstacles.length)
//                     for(int i=0;i<obstacles.length;i++){
//                         if(obstacles[i][0]==x && obstacles[i][1]==y){
//                             // x = x-1;
//                             isfoundObs = true;
//                             break;
//                         }
//                     }
//                     move--;
//                     if(isfoundObs) break;
//                 }
//             }
//             else if(d=="E"){
//                 // x+=i;
//                 while(move!=0){
//                     x+=move;
//                     // if(P<obstacles.length)
//                     for(int i=0;i<obstacles.length;i++){
//                         if(obstacles[i][0]==x && obstacles[i][1]==y){
//                             // x = x-1;
//                             isfoundObs = true;
//                             break;
//                         }
//                     }
//                     move--;
//                     if(isfoundObs) break;
//                 }
//             }
//             else if(d=="W"){
//                 // x-=i;
//                 while(move!=0){
//                     x-=move;
//                     // if(P<obstacles.length)
//                     for(int i=0;i<obstacles.length;i++){
//                         if(obstacles[i][0]==x && obstacles[i][1]==y){
//                             // x = x-1;
//                             isfoundObs = true;
//                             break;
//                         }
//                     }
//                     move--;
//                     if(isfoundObs) break;
//                 }
//             }
//             else{
//                 // y-=i;
//                 while(move!=0){
//                     y-=move;
//                     // if(P<obstacles.length)
//                     for(int i=0;i<obstacles.length;i++){
//                         if(obstacles[i][0]==x && obstacles[i][1]==y){
//                             // x = x-1;
//                             isfoundObs = true;
//                             break;
//                         }
//                     }
//                     move--;
//                     if(isfoundObs) break;
//                 }
//             }
//         }

//         // ans return 
//         return (x*x)+(y*y);

//     }
// }

