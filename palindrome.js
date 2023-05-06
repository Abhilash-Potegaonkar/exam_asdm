let calculate=(a)=>
{
    let rem,rev=0,temp
    temp=a
    while(a>0)
    {
        rem=a%10;
        rev=(rev*10)+rem;
        a=parseInt(a/10);
    }
    if(temp==rev)
    {
       console.log(`${temp} is a palindrome`)
    }
    else
    {
        console.log(`${temp} is not a palindrome`)
    }   
}
module.exports={calculate}