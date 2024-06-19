# git-in-practice

Создаём ветку
`git checkout -b feature/TASK-123 --no-track origin/trunk`
Создаём ветку в origin
`git push -u origin $(git branch --show-current)`

Вносим изменения и добавляем их в отслеживаемые
`git add .`

`git commit -m TASK-123 Добавлена важная доработка`

`git push`

Готовим ветку к Pull Request:
1. Вмёрдживаем основную ветку к себе
`git fetch
git merge origin/trunk`
2. Делаем squash (один из способов, как по мне самый простой)
`git reset --soft $(git merge-base master HEAD)
git commit -m "TASK-123 Добавлен один красивый коммит"
git rebase origin/trunk`
3. Пушим свои изменения
`git push --force-with-lease`

git branch -a - показать список веток

git log --graph --oneline --decorate - посмотреть историю коммитов в виде графика

Самый простой способ

![img.png](img.png)

![img_1.png](img_1.png)