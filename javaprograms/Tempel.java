class Tempel{
List <Rooms> rooms;
Double area;
TempelTypes tempelTypes;
}

class Rooms{
Double height;
Double width;
Double length;
RoomTypes roomTypes;
}

class Garden{
Double width;
Double length;
List <Tree> trees;
List <Flower> flowers;
int petals;
int leaf;
int stem;
GardenTypes gardenTypes;
}

class Riligion extends Tempel{
String RiligionName ;
List <people> peoples;
String gender;
RiligionType riligionType;
List <RiligionName> riligionName;
}

