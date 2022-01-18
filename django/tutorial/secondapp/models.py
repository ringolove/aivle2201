from django.db import models

# Create your models here.
# 1. 클래스
# 2. 모델 상속
# 3. 속성 => 변수 = 000Field 대입
class Course(models.Model):
    name = models.CharField(max_length=30)
    cnt = models.IntegerField()
    
class Armyshop(models.Model):
    year = models.IntegerField()
    month = models.IntegerField()
    type = models.TextField()
    name = models.TextField()
    class Meta:
        db_table = 'army_shop'
        ordering = ['-id']
        managed = False
        
    def __str__(self):
        return self.name