# Algorithm-solutions-studies
! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'git@github.com:zapnaa/abcappp.git'
gibi hata ile karşılaştım bu hatamı stackoverflow.com dan araştırma yaparak çözümünü buldum (https://stackoverflow.com/questions/28429819/rejected-master-master-fetch-first)
git fetch origin main:tmp
git rebase tmp
git push origin HEAD:main
git branch -D tmp
