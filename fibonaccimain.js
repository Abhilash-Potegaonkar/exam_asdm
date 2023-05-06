const fibo =require('./fibonacci')
const prompt=require('prompt')
prompt.start()
prompt.get(["n"],(err,res)=>{
    if (err) throw err
    console.log(`Febonacci series of count ${res.n} is:`)
    fibo.fibonacci(res.n)
})