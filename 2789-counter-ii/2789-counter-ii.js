/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
   var ans=init;
    function increment(){
        return ans+=1;
    }
    function decrement(){
        return ans-=1;
    }
    function reset(){
               return ans=init;
    }
 return {
     increment,decrement,reset
 }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */