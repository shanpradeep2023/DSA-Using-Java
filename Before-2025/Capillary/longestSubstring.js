const longestSubstringWithoutRepeatingChars = (str) => {
    let count = 0;
    let maxCount = 0;

    let seen = new Set();

    str.split('').forEach(element => {
        if (!seen.has(element)) {
            seen.add(element);
            count++;
        } else {
            maxCount = count > maxCount ? count : maxCount;
            count = 1;
        }
    });

    return maxCount;
}

console.log(longestSubstringWithoutRepeatingChars("pwwkew")); // 3