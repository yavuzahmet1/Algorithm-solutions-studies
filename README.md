# Algorithm-solutions-studies
! [rejected]        master -> master (fetch first)<br>
error: failed to push some refs to 'git@github.com:zapnaa/abcappp.git'<br>
gibi hata ile karşılaştım bu hatamı stackoverflow.com dan araştırma yaparak çözümünü buldum (https://stackoverflow.com/questions/28429819/rejected-master-master-fetch-first)<br>
git fetch origin main:tmp<br>
git rebase tmp<br>
git push origin HEAD:main<br>
git branch -D tmp<br>
