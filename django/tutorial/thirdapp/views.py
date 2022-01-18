from django.shortcuts import render
from .models import Jejuolle, Shop

# Create your views here.
def shop(request):
    shop_list = Shop.objects.all()

    return render(
        request,
        'thirdapp/shop.html',
        {'shop_list': shop_list}
    )
    
def jeju_olle(request):
    jeju_olle = Jejuolle.objects.all()

    return render(
        request,
        'thirdapp/jeju_olle.html',
        {'jeju_olle': jeju_olle}
    )    