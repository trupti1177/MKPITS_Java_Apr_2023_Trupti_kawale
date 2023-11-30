function mySum(a,b,callback){
    console.log(a+b);
    callback();
}
function display(){
    console.log("hello world");
}
mySum(12,45,display);