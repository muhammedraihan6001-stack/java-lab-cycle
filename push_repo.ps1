$git = 'C:\Program Files\Git\cmd\git.exe'
Set-Location 'd:\java lab cycle'
& $git init
& $git add .
& $git -c user.name='Auto Commit' -c user.email='auto@local' commit -m 'Add Java lab cycle solutions (Tasks 1-20)' 2>$null
& $git branch -M main
try { & $git remote remove origin } catch {}
& $git remote add origin https://github.com/muhammedraihan6001-stack/java-lab-cycle.git
& $git push -u origin main
Write-Output 'Done script'
