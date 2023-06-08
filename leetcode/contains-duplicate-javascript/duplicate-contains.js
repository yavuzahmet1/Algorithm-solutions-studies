var containsDuplicate = function (nums) {
  let set = new Set();

  for (let num of nums) {
    if (set.has(num)) return true;
    set.add(num);
  }
  return false;
};
let a = [1, 3, 2, 5, 1];
console.log(containsDuplicate(a));
