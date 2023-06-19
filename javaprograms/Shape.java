class Shape{
List <Patterns> patterns;
Double area;
string color;
integer No_Of_Sides;
integer angle;
AnglesType anglesType;
}

class Patterns{
float height;
float width;
float length;
PatternsType patternsType;
}

class ShapePatterns extends Shape{
List <ShapePatterns> shapePatterns;
}
