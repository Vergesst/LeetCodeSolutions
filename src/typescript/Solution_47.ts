function permuteUnique(nums: number[]): number[][] {
    let result: number[][] = []
    let path: number[] = []
    let l = nums.length
    let vis = new Array(l).fill(false)

    nums.sort((x, y) => x - y)
    backTrend(0)
    return result

    function backTrend(index: number) {
        if(path.length === nums.length) {
            result.push(path.slice())
            return
        }
        for(let i = 0; i < l; i++) {
            if(vis[i] || (i > 0 && nums[i] === nums[i - 1] && !vis[i - 1])) {
                continue
            }
            path.push(nums[i])
            vis[i] = true
            backTrend(index + 1)
            vis[i] = false
            path.pop()
        }
    }
}