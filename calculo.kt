fun main(){
    var a = 5;
    var b = 3;
    var result = 0;
    var soma = true;
    var sub = false;
    var mult = false; 
    var div = false;
    
    println("Digite o que o que deseja realizar: soma, sub, mult ou div");
    
    if(soma){result = a + b;} 
    else if(sub) {result = a - b;}
    else if(mult) {result = a * b;}
    else if(div) {result = a / b;}
    
    println(result);
}