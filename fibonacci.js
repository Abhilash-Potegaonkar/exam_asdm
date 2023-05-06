let fibonacci=(a)=>{
    let i
    let n1=1
    console.log(n1)
    let n2=2
    console.log(n2)
    let n3
    for(i=2;i<a;i++)
    {
        n3=n1+n2
        console.log(n3)
        n1=n2
        n2=n3
    }
}
module.exports={fibonacci}