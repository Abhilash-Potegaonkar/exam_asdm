const factorial=require('./factorial')
const prompt=require('prompt')
prompt.start()
prompt.get(["n"],(err,res)=>{
    if (err) throw err
    console.log(`Factorial of ${res.n} is ${factorial.fact(res.n)}`)
})
