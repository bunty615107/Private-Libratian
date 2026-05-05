# PowerShell script to push Private Librarian to GitHub
# Usage: .\push_to_github.ps1 -RepoUrl "https://github.com/yourusername/private-librarian.git"

param (
    [Parameter(Mandatory=$true)]
    [string]$RepoUrl
)

# 1. Add all files
git add .

# 2. Initial commit
git commit -m "Initial commit: Private Librarian with Gemma 4 RAG pipeline"

# 3. Rename branch to main
git branch -M main

# 4. Add remote
git remote add origin $RepoUrl

# 5. Push to GitHub
git push -u origin main

Write-Host "Successfully pushed to $RepoUrl" -ForegroundColor Green
