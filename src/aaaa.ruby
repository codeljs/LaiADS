def palindrome(number)
  #先将整数转化成一个数组
  array = number.chars
  #如果组成n的数字中，每一个只包含一个，那么直接返回最大的那个数字
  return array.map(&:to_i).sort.last if array.all? {|ele| array.count(ele) == 1}
  #找出包含有2个以上的数字，用hash来存一下
  h = {}
  array.each {|ele| h.store ele,array.count(ele)}
  #.split.
  tmp = h.keep_if {|k,v| v > 1}.each {|k,v| h[k] = v.odd? ? v-1 : v}.map {|k,v| k * v}.join.split("").sort_by(&:to_i)
  s = ""
  if array.size > tmp.size
    a = array.uniq.sort_by(&:to_i)
    until a.empty?
      n = a.pop
      if array.count(n) > tmp.count(n)
        s << n
        break
      end
    end
  end
  until tmp.empty?
    s = tmp.shift + s
    s = s + tmp.shift
  end
  s
end