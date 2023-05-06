let fact=(a)=>{
    let fact=1,i=1
    for(i=1;i<=a;i++)
    {
        fact=fact*i
    }
    return fact
}
module.exports={fact}