

- Solution:

```text
 git restore --staged src/app.js
 rm src/app.js
 mv src/index.html public/
 mv public/index.js src/
 touch .gitignore
 echo node_modules > .gitignore
 echo bower_components >> .gitignore
 git add .
 git commit -m"changes"
```
