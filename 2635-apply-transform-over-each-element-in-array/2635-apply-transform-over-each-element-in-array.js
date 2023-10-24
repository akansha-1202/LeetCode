/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    
    for(let i in arr){
        arr[i] = fn(arr[i], Number(i));
    }
    return arr;
};