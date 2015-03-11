def printNum
  yield 5
  p "world"
end

printNum {|n| p "No. #{n} hello" }

##################################################
# <===================OUTPUT===================> #
# (master) i309511:13 $ ruby test.rb             #
# "No. 5 hello"                                  #
# "world"                                        #
##################################################
