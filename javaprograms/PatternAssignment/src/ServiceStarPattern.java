public class ServiceStarPattern {
    public int serviceStarPattern(int pattern,int number){
        switch (pattern){

            case 1:
                StarInvertedTriangle starInvertedTriangle=new StarInvertedTriangle();
                int triangle1=starInvertedTriangle.starpattern(number);
                return triangle1;
            case 2:

                MeargeStarRightAngle meargeStarRightAngle=new MeargeStarRightAngle();
                int rightangle=meargeStarRightAngle.starpattern(number);
                MeargeStarInvertedRightAngle meargeStarInvertedRightAngle =new MeargeStarInvertedRightAngle();
                int mergeRightAngle= meargeStarInvertedRightAngle.starpattern(number);
                break;

            case 3:
                StarTriangle starTriangle=new StarTriangle();
                int triangle= starTriangle.starpattern(number);
                StarInvertedTriangle starReverseTriangle=new StarInvertedTriangle();
                int invertedTriangle=starReverseTriangle.starpattern(number);
                break;

            case 4:
                StarReverseRightAngle starRightAngle=new StarReverseRightAngle();
                int reversRightAngle=starRightAngle.starpattern(number);
                return reversRightAngle;
            case 5:
                TimerShapePyramid timerShapePyramid=new TimerShapePyramid();
                int timerShape=timerShapePyramid.starpattern(number);
                TimerShapePyramidDown timerShapePyramidDown=new TimerShapePyramidDown();
                int downTimer=timerShapePyramidDown.starpattern(number);
                break;
            case 6:
                TimerPatternWithNumber timerPatternWithNumber=new TimerPatternWithNumber();
                int timerShapeUsingNumber=timerPatternWithNumber.starpattern(number);
                TimerPatternUsingNumberDown timerPatternUsingNumberDown=new TimerPatternUsingNumberDown();
                int downTimerShapeUsingNumber=timerPatternUsingNumberDown.starpattern(number);
                break;

        }
        return 0;
    }
}