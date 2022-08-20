# YasashiJava
A note for java Learning


1. 先在github建立新的repository
2. 去github setting， 找到Developer settings
3. 点击personal access tokens 然后点击 generate new personal access token
4. 输入note，勾选所有内容后点击generate token （一定要勾选所有内容）
5. 保存token
6. 终端移动到要上传的文件所在文件夹，输入
`$ git init` 	-> 形成本地库
7. 查看本地库里的内容
`$ git status`
8. 添加本地文件库中所有内容
`$ git add .`
9. 再次查看本地库里的内容
`$ git status`
10. 复制repository连接
11. 远程遥控 

* 対象リポジトリをローカルのリモートリポジトリに追加する: 

 * `$ git remote add リモート名 リモート URL`

 * 例如: `$ git remote add origin https://github.com/hwh711-coder/github-.git`

 * 例如: `$ git remote add origin https://github.com/hwh711-coder/YasashiJava.git `

* リモート已存在：

  * 确认remote: `$ git remote -v`

  * 删除remote： `$ git remote rm origin`

  * 重命名remote(リモート名を「origin」から「destination」に変更) `$ git remote rename origin destination`


12. 查看设定的用户名和邮箱
`$ git config -l`
`$ git config --global user.name`
`$ git config --global user.email`
`$ git config --system user.name`
`$ git config --system user.email`
`$ git config --local user.name`
`$ git config --local user.email`
重新设置用户名/邮箱
`$ git config --global user.name “新用户名”`
`$ git config --global user.email “新邮箱”`

13. commit本地库
`$ git commit -m "first commit”`

14. push到github
1. 列出所有分支 `$ git branch -a`
2. 创建test分支 `$ git branch test`
3. 切换到test分支: `$ git checkout test`
4. 添加add修改: `$ git add .`
5. 添加commit注释 `$ git commit -m "第一次提交代码"`
6. 提交到服务器 `$ git push origin test`

`$ git push -u origin(リモート名) master(branch名)`
`$ git push -u origin(リモート名) weihan(branch名)`

15. 输入用户名和token
Username for 'https://github.com': 输入用户名
Password for 'https://hwh@github.com': 输入token

</br>
</br>
</br>

更新代码

1. 输入下载指令下载自己在GitHub上的profile
`$ git clone https://github.com/CSwuyp/socket.git//后面这个是你的GitHub上profile的地址`

2. git status查看状态
`$ git status`

3. 新后使用git add * --代表更新全部
`$ git add *`

4. 接着输入git commit -m "更新说明"，commit只是提交到缓存区域
`$ git commit -m "update”`

5. 如果多人同时开发维护代码，得先git pull,拉取当前分支最新代码
`$ git pull`

6. 最后git push origin master,最后一步才是push到远程master分支上
`$ git push -u origin master`

</br>
</br>
</br>

初始化一个空的git本地仓库
`$ git init`

删除本地仓库.git
`$ rm -rf .git`
