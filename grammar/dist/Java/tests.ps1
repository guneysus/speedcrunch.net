# Get-Content "..\..\constant-expressions.txt" | % { echo $_ | grun Calc startRule -tree -tokens -trace -gui -diagnostics -SLL }
# Get-Content "..\..\pos-int-add.txt" | % { echo $_ | grun Calc startRule -tree -tokens -trace -gui -diagnostics -SLL }

echo "10-5" | % { echo $_ | grun Calc startRule -tokens -tree -gui }