from django.shortcuts import render
from django.http import HttpResponse
from .models import Course

# Create your views here.
def main(request):
    return HttpResponse('<u>Main</u>')

def insert(request):
    Course(name='데이터 분석', cnt=30).save()
    Course(name='데이터 수집', cnt=20).save()
    Course(name='웹개발', cnt=25).save()
    Course(name='인공지능', cnt=20).save()

    return HttpResponse('데이터 입력 완료')

def show(request):
    course = Course.objects.all()
    result = ''
    for i in course:
        result += '%s %s<br>' % (i.name, i.cnt)
    return HttpResponse(result)