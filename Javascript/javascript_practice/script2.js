function myMultiply(a,b,callback){
    // console.log("multiply = " + (a*b));
    if(a > b)
    console.log("a is greater than b " + (a > b))
    else
    console.log("b is greater " + (b > a));
    setTimeout(callback,5000);
}
function print(){
    console.log("Hello World");
}
myMultiply(12,18,print);