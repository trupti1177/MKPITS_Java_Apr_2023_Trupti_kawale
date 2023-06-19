
class Hospital{
List <Rooms> rooms;
Double area;
List <Department> departments;
HospitalType hospitalType;
}

class Rooms{
Double height;
Double width;
Double length;
RoomTypes roomTypes;
}
class Departments{
String specialists;
List <Doctor> doctors;
String gender;
DepartmentsTypes departmentsTypes;
}
class Floor extends Hospital{
string FloorName;
FloorType floorType;
string HospitalName;
Integer FloorNo;
}



